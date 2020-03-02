# dockersingle
docker single project
docker image build -t employee .
docker container run --name producer -p 8080:8080 -d employee