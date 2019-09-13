const Calc = require('./node').Calculator;
const obj = new Calc();

// process object to access arguments
//process.argv
let _first = parseInt(process.argv[2] || '5');
let _next = parseInt(process.argv[3] || '7');
let operate = process.argv[4] || 'ramdom';
if (operate=='add')
{
    console.log(obj._add(_first,_next))
}
else if (operate=="sub")
{
    console.log(obj._sub(_first,_next))
}
else if (operate=="mul")
{
    console.log(obj._mul(_first,_next))
}
else{
    console.log('wrong')
}
