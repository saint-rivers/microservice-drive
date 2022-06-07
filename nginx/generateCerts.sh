#!/bin/bash

openssl req -x509 -nodes -days 365 \
  -newkey rsa:2048 \
  -keyout saintrivers.key \
  -out saintrivers.crt \
  -config saintrivers.conf \
  -passin pass:mrrobot

openssl pkcs12 -export -out saintrivers.pfx \
  -inkey saintrivers.key \
  -in saintrivers.crt

echo myca/myca.crt >> /etc/ca-certificates.conf

/usr/sbin/update-ca-certificates