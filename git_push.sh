#! /bin/bash

v_date=$(date "+%Y-%m-%d_%H_%M_%S")

git add .
git commit -m "auto commit "${v_date}
git push

