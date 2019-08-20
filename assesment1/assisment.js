const subject = [
    {
        id : 1,
        name : 'english'
    },
    {
        id : 2,
        name : 'maths'
    },
    {
        id : 3,
        name : 'Cse'
    },
    {
        id : 4,
        name : 'Physics'
    }
];
JSON.stringify(subject)
localStorage.setItem("id", JSON.stringify(subject));

function savedata(){
    let _name = document.getElementById('name').value;
    let _email = document.getElementById('email').value;
    let _subject = document.getElementsByName('_check');
    let sub =[];
    _subject.forEach(s=>{
        if(s.checked){
            sub.push(s.value);
        }
    })
    let trs = [];
    let trainer = [
        {
            name: _name,
            email: _email,
            subjects: sub
        }
    ] 
    if(localStorage.getItem("trs") !=null){
        trs = JSON.parse(localStorage.getItem("trs"));
        trs.push(trainer)
        }
    else{
        trs.push(trainer)
    }
       
    localStorage.setItem("emps",JSON.stringify(trs));
}