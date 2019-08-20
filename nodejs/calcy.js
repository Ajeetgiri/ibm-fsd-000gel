const express = require('express');
const server = express();
const parser = require('body-parser');

server.use(parser.json());

server.get('/status',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(
        JSON.stringify({
            message : "Hello world Service is Running"
        }));
});

// message api
server.get('/message/:message',(req,res)=>{
    res.end(
        JSON.stringify({
            message : req.params.message
        })
    );
});

// calculate api
server.get('/calculate/:operand/:num1/:num2',(req,res)=>{
    let p =(req.params.operand)
  if(p=='add'){
    res.end(JSON.stringify({
        result : parseInt(req.params.num1) + parseInt(req.params.num2)
    }));

}   if(p=='sub'){
    res.end(JSON.stringify({
        result : parseInt(req.params.num1) - parseInt(req.params.num2)
    }));
}

});

// add user api
server.post('/user',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        user :{
            name : req.body.name,
            email: req.body.email
        }
    }));
});

// PORT Binding
const PORT = 12345;
server.listen(PORT,()=>{
    console.log(`Server Started at ${PORT}`);
});