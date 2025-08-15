function validateName(){
let userName=document.getElementById("nameId").value;
let nameError=document.getElementById("nameErrorId");
if(userName.length<3 || userName.length>10){
nameError.innerText="Name length between 3 and 10";
}else{
nameError.textContent="";
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

function validatePhone(){
let userPhone=document.getElementById("phoneId").value;
let phoneError=document.getElementById("phoneErrorId");
if(userPhone.length!=10){
phoneError.innerText="Phone Number length is 10"
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

function validateGender(){
let userGender=document.getElementById("genderId").value;
let genderError=document.getElementById("genderErrorId");
if(userGender==="Select Gender"){
genderError.innerText="Please select Gender";
}else{
genderError.innerText="";
}
}


function validatePassword(){
let userPassword=document.getElementById("passwordId").value;
let passwordError=document.getElementById("passwordErrorId");
let passwordPattern=/^(?=.*[A-Z])(?=.*[^A-Za-z0-9])(?=(.*\d){3,}).{3,15}$/;

if(!passwordPattern.test(userPassword)){
passwordError.innerText="Must have 1sp,1Cap,3 no";
}else{
passwordError.innerText="";
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