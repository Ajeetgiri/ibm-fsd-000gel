function display (val)
{

document.getElementById("box").value+=val

}

function operate ()
{ 
    let x = document.getElementById("box").value 
             let y = eval(x) 
             document.getElementById("box").value = y
}

function clear() 
{ 
    document.getElementById("box").value = "" 
} 