<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<style>

html {
  background-color: #E4E9FD;
  background-image: -webkit-linear-gradient(65deg, #59B379 50%, #FBFBFB 50%);
  min-height: 1000px;
  font-family: 'helvetica neue';
}

h1 {
  color: #fff;
  padding: 10px;
}

.box {
  max-width: 400px;
  margin: 50px auto;
  background: white;
  border-radius: 5px;
  box-shadow: 5px 5px 15px -5px rgba(0, 0, 0, 0.3);
}

#heading {
  background-color: #59B379;
  text-align: center;
}

.item {
  min-height: 70px;
  display: flex;
  align-items: center;
  border-bottom: 1px solid #F1F1F1;
}

.item:last-child {
  border-bottom: 0;
}

a {

  text-decoration-color: #59B379;
}


p {
  text-decoration-color: #59B379;
  margin: 0;
  padding: 20px;
  font-size: 20px;
  font-weight: 200;
  color: #00204a;
}

.abutton {
  background-color: #59B379;  
  border-radius: 5px;
  color: white;
  padding: .5em;
  text-decoration: none;
  	padding-top: 5px;
	padding-right: 12px;
	padding-bottom: 5px;
	padding-left: 12px;
}

.abutton:focus,
.abutton:hover {
  background-color: #234c32;
  color: White;
}

.itemwidth{
	width: 313px
}

form.item {
  text-align: center;
  margin-left: 20px;
}

button {
  min-height: 50px;
  width: 50px;
  border-radius: 50%;
  border-color: transparent;
  background-color: #59B379;
  color: #fff;
  font-size: 30px;
  padding-bottom: 6px;
  border-width: 0;
}

button:focus,
button:hover {
  background-color: #234c32;
  color: White;
}

input[type="text"] {
  text-align: center;
  height: 60px;
  top: 10px;
  border: none;
  background: transparent;
  font-size: 20px;
  font-weight: 200;
  width: 313px;
}

input[type="text"]:focus {
  outline: none;
  box-shadow: inset 0 -3px 0 0 #59B379;
}

::placeholder {
  color: grey;
  opacity: 1;
}

footer {
  color: white;
  color: rgba(0, 0, 0, 0.5);
  text-align: center;
}


</style>
