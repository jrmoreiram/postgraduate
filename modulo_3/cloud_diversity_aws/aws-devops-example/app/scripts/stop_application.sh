#!/bin/bash
# Stop the Node.js application if it's running
if pgrep -f "node index.js" > /dev/null
then
  pkill -f "node index.js"
  echo "Node.js application stopped."
else
  echo "Node.js application not running."
fi
