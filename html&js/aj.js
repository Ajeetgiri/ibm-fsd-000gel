

     function clickMe(){
document.getElementById('eng');
document.getElementById('maths');
document.getElementById('cse');

let _table = `<table>

<tr>
<td>sbjects</td>
<td>min marks</td>
<td>max marks</td>
<td>marks obtain </td>
</tr>
<tr>
<td>eng</td>
<td>60</td>
<td>100</td>
<td>${eng.value}</td>
</tr>
<tr>
<td>maths</td>
<td>60</td>
<td>100</td>
<td>${maths.value} </td>
</tr>
<tr>
<td>cse</td>
<td>60</td>
<td>100</td>
<td>${cse.value} </td>
</tr>
</table>`;

document.getElementById('table_').innerHTML=_table;
let sum=parseInt(eng.value)+parseInt(maths.value)+parseInt(cse.value);
avg=sum/3;

if (sum>180 && maths.value>60 && eng.value>60 && cse.value>60)
{
    document.getElementById('result').innerHTML=`total marks obtain=${sum}<br/>
    result=pass`;
}
else{
    document.getElementById('result').innerHTML=`total marks obtain=${sum}<br/>
    result=fail`;
}
     }