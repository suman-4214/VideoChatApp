
function handleLogin(event) {
    event.preventDefault(); // Prevent the default form submission
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    const user ={
        email: email,
        password: password
    };

    fetch("http://localhost:8080/api/users/login", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(user)
    }).then(response => {
        if(!response.ok){
            alert("Login failed. Please check your credentials.");
        }
        return response.json();
    }).then((response)=> {
        localStorage.setItem('connectedUsers', JSON.stringify(response));
        window.location.href = "index.html"; // Redirect to the home page
    }).catch(error => {
        console.error('POST request error', error);
    });

}

const loginForm = document.getElementById("loginForm");
loginForm.addEventListener("submit", handleLogin);
