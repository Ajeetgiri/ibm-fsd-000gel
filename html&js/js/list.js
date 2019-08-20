
const saveemp= () =>{
    let name = document.getElementById('name').value;
    let email = document.getElementById('email').value;
    let organization = document.getElementById('organization').value;
    let emps = [];
    let emp = {
        name : name,
        email: email,
        organization: organization
    };
    

    if(localStorage.getItem("emps") !=null){
        emps = JSON.parse(localStorage.getItem("emps"));
       let empfound =  emps.find((e)=>{
           return e.email == email;

        }); 
        if(empfound != undefined){
            alert('email exists try different');
        }   
        else{
            emps.push(emp);
        }
    }
    else{

        emps.push(emp);
    }
    

    
    localStorage.setItem("emps",JSON.stringify(emps));

 loadEmployees();
}
    const loadEmployees = ()=>{
        let rows='';
        emps = JSON.parse(localStorage.getItem("emps"));
        emps.forEach((employee)=>{
            rows += `<tr>
                        <td>${employee.name}</td>
                        <td>${employee.email}</td>
                        <td>${employee.organization}</td>
                    </tr>`
        });
    
        let table = `<table>
             <tr>
            <th>name</th>
            <th>email</th>
            <th>organization</th>
            </tr>
                ${rows}
            </table>`;
        document.getElementById('table').innerHTML = table;
    
    
}

const removeItem=()=>{
    emps = JSON.parse(localStorage.getItem("emps"));
    let _email = document.getElementById('email1').value;
    
    const eExists = emps.find((e)=>{
        return e.email == _email;
    });
    
    let newEmps = [];

    if(eExists != undefined){
        newEmps = emps.filter(e=>{
            return eExists.email != e.email;
        });
        localStorage.setItem("emps",JSON.stringify(newEmps));
    }
    else{
        localStorage.setItem("emps",JSON.stringify(emps));
    }
    
    loadEmployees();
}