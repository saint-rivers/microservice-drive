#!/bin/bash

export HOST="http://localhost:8800/auth/realms/myrealm/.well-known/openid-configuration"

# curl -X POST \
#   --url http://localhost:8001/services/drive-service/plugins \
#   --data "name=oidc" \
#   --data "config.client_id=myclient" \
#   --data "config.client_secret=jAm3yNm3VkfK8oXgU5SNJGZmO8GK80QQ" \
#   --data "config.discovery=$HOST" \
#   --data "config.realm=myrealm"

curl -s -X POST http://saintrivers.tech:8001/plugins \
  --data "name=oidc" \
  --data "config.client_id=myclient" \
  --data "config.client_secret=xmmLi7dxS23QxdrvV89ilxzGUYKEa9BM" \
  --data "config.discovery=https://saintrivers.tech:8443/auth/realms/myrealm/.well-known/openid-configuration"  \
  --data "config.realm=myrealm"
