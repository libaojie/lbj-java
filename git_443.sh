#! /bin/bash

v_date=$(date "+%Y-%m-%d_%H_%M_%S")

git config --global http.proxy "localhost:1080"
git config --global http.proxy 'http://127.0.0.1:1087'
git config --global https.proxy 'socks://127.0.0.1:1080'

