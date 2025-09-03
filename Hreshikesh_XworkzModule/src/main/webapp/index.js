function validateName(){
let userName=document.getElementById("nameId").value;
let nameError=document.getElementById("nameErrorId");
let pattern=/^[A-Za-z ]+$/
if(userName.length<3 || userName.length>10 && pattern.test(userName)){
nameError.innerText="Name length between 3 and 10 and name should not contain numbers";
}else{
nameError.innerText="";
}
}

function validateEmail(){
let userEmail=document.getElementById("emailId").value;
let emailError=document.getElementById("emailErrorId");
let emailPattern=/^[A-Za-z0-9]+@gmail\.com$/;
if(!emailPattern.test(userEmail)){
emailError.innerText="Email should be in this pattern [A-Za-z0-9]gmail.com"
}else{
emailError.innerText="";
}
}


function checkEmail(){
let userEmail=document.getElementById("emailId").value;
let emailError=document.getElementById("emailErrorId");

const xhttp=new XMLHttpRequest();

xhttp.open("GET","http://localhost:8080/Hreshikesh_XworkzModule/checkEmail/"+userEmail);
xhttp.send();

xhttp.onload=function(){
emailError.innerHTML=this.responseText;
}
}

function validatePhone(){
let userPhone=document.getElementById("phoneId").value;
let phoneError=document.getElementById("phoneErrorId");
let phonePattern=/^[6-9]\d{9}$/
if(!phonePattern.test(userPhone)){
phoneError.innerText="PhoneNo should start from 9876 and length 10"
}else {
phoneError.innerText=""
}
}


function validateAge(){
let userAge=document.getElementById("ageId").value;
let ageError=document.getElementById("ageErrorId");
if(userAge<15 ||  userAge>50){
ageError.innerText="Age Should be 15-50";
}else{
ageError.innerText="";
}
}

function validateGender() {
  let userGender = document.getElementById("genderId").value;
  let genderError = document.getElementById("genderErrorId");
  if (userGender === "") {
    genderError.innerText = "Please select Gender";
    return false;
  } else {
    genderError.innerText = "";
    return true;
  }
}

function validatePassword(){
let userPassword=document.getElementById("passwordId").value;
let passwordError=document.getElementById("passwordErrorId");
let passwordPattern=/^(?=.*[A-Z])(?=.*[^A-Za-z0-9])(?=(.*\d){3,}).{8,15}$/;

if(!passwordPattern.test(userPassword)){
passwordError.innerText="Must have 1sp,3no,1cap Must be 8-15 char";

}else{
passwordError.innerText="";
}
}

function viewPassword(){
let password=document.getElementById("passwordId");
let icon=document.getElementById("toggleIcon");
if(password.type==="password"){
password.type="text";
icon.classList.remove("bi-eye")
icon.classList.add("bi-eye-slash")
}else{
password.type="password";
icon.classList.remove("bi-eye-slash")
icon.classList.add("bi-eye")
}
}

function validateConfirmPassword(){
let userPassword=document.getElementById("passwordId").value;
let confirmPassword=document.getElementById("cpasswordId").value;
let cpasswordError=document.getElementById("cpasswordErrorId");

if(userPassword!==confirmPassword){
cpasswordError.innerText="Password doesnt match";
}else{
cpasswordError.innerText="";
}
}


