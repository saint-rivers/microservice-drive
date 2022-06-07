FROM nginx:latest

COPY nginx.conf /etc/nginx/nginx.conf
COPY saintrivers.crt /etc/ssl/certs/saintrivers.crt
COPY saintrivers.key /etc/ssl/private/saintrivers.key