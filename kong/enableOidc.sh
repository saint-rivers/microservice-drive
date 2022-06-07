#!/bin/bash

# curl -X DELETE 'http://localhost:8001/services/test-api/plugins/'

export HOST="http://localhost:8800/auth/realms/myrealm/.well-known/openid-configuration"

curl -X POST \
  --url http://localhost:8001/services/drive-service/plugins \
  --data "name=oidc" \
  --data "config.client_id=myclient" \
  --data "config.client_secret=jAm3yNm3VkfK8oXgU5SNJGZmO8GK80QQ" \
  --data "config.discovery=$HOST" \
  --data "config.realm=myrealm"

# this redirects properly but google cannot redirect to a private ip address
# 172.26.0.5
# this one is the private ip of the docker container

# 128.199.164.171
# this is the server of my ip
