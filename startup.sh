#!/bin/bash

# Build Maven modules
echo "Building Maven modules..."
#mvn clean install -U

# Check if the Maven build was successful
if [ $? -eq 0 ]; then
  echo "Maven build successful. Starting Docker containers..."
  # Start Docker containers using docker-compose
  docker-compose up
else
  echo "Maven build failed. Aborting Docker container startup."
fi
