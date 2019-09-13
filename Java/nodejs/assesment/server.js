var http = require('http');

http.createServer(function (req, res) {
  res.write('server is started');
  res.end(); 
}).listen(1000),{

}
