#!/bin/bash

curl -i -X POST http://localhost:8001/services \
    --data name=drive-service \
    --data url='http://saintrivers.tech:8081'

curl -i -X POST http://localhost:8001/services/drive-service/routes \
    --data 'paths[]=/drive' \
    --data name=drive
