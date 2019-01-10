#Start rabbitmq at http://localhost:15672/ and user `root` and pass `root` and configure rabbit ui management
#Start camunda at http://localhost:8080/ and user `demo` and pass `demo` and configure camunda ui
docker-compose up -d
sleep 10
docker exec rabbitymq-test-1 rabbitmq-plugins enable rabbitmq_management
