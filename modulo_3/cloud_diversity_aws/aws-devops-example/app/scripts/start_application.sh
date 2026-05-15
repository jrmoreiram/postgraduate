#!/bin/bash
cd /home/ec2-user/aws-devops-sample-app
npm install
npm start > /dev/null 2>&1 &
