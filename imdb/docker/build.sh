#!/bin/sh


git pull
docker build -t backend -f Dockerfile

