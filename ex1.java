<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Bara | Personal Website</title>

<style>
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: Arial, sans-serif;
}

html {
    scroll-behavior: smooth;
}

body {
    background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
    color: white;
}

/* NAVBAR */
nav {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 15px 30px;
    background: rgba(0,0,0,0.7);
    position: fixed;
    width: 100%;
    top: 0;
    z-index: 1000;
}

nav h2 {
    color: #00d4ff;
}

nav ul {
    list-style: none;
    display: flex;
}

nav ul li {
    margin-left: 20px;
}

nav ul li a {
    text-decoration: none;
    color: white;
    transition: 0.3s;
}

nav ul li a:hover {
    color: #00d4ff;
}

/* HAMBURGER */
.menu-toggle {
    display: none;
    font-size: 28px;
    cursor: pointer;
}

/* SECTIONS */
section {
    padding: 100px 20px;
    text-align: center;
}

.container {
    max-width: 900px;
    margin: auto;
}

h1 {
    font-size: 40px;
    margin-bottom: 20px;
}

p {
    font-size: 20px;
    line-height: 1.6;
}

button {
    margin-top: 20px;
    padding: 12px 25px;
    border: none;
    background: #00d4ff;
    color: black;
    font-weight: bold;
    border-radius: 25px;
    cursor: pointer;
    transition: 0.3s;
}

button:hover {
    background: white;
    transform: scale(1.05);
}

/* IMAGES */
.images {
    margin-top: 30px;
}

.images img {
    width: 250px;
    margin: 15px;
    border-radius: 15px;
    transition: 0.4s;
}

.images img:hover {
    transform: scale(1.1);
}

/* FOOTER */
footer {
    background: rgba(0,0,0,0.8);
    padding: 20px;
    text-align: center;
}

/* MOBILE */
@media (max-width: 768px) {
    nav ul {
        display: none;
        flex-direction: column;
        background: rgba(0,0,0,0.9);
        position: absolute;
        top: 60px;
        right: 0;
        width: 200px;
        text-align: center;
    }

    nav ul.show {
        display: flex;
    }

    nav ul li {
        margin: 15px 0;
    }

    .menu-toggle {
        display: block;
    }

    .images img {
        width: 80%;
    }
}
</style>
</head>
<body>

<!-- NAVBAR -->
<nav>
    <h2>Bara</h2>
    <div class="menu-toggle" onclick="toggleMenu()">☰</div>
    <ul id="menu">
        <li><a href="#home">Home</a></li>
        <li><a href="#about">About Me</a></li>
        <li><a href="#hobbies">Hobbies</a></li>
        <li><a href="#contact">Contact</a></li>
    </ul>
</nav>

<!-- HOME -->
<section id="home">
    <div class="container">
        <h1>Hello, I'm Bara 👋</h1>
        <p>Welcome to my personal interactive website!</p>
        <button onclick="showMessage()">Click Me 🚀</button>
    </div>
</section>

<!-- ABOUT -->
<section id="about">
    <div class="container">
        <h1>About Me</h1>
        <p>
            I am 16 years old.<br>
            Born on 5/5/2010 in Jerusalem.<br><br>
            I love my friends ❤️<br>
            My favorite subjects are Computer Science 💻, Math ➗ and Physics ⚛️.
        </p>
    </div>
</section>

<!-- HOBBIES -->
<section id="hobbies">
    <div class="container">
        <h1>Things I Love</h1>
        <p>I love video games 🎮 and football ⚽</p>
        
        <div class="images">
            <img src="https://images.unsplash.com/photo-1605902711622-cfb43c4437d1" alt="Gaming Setup">
            <img src="https://images.unsplash.com/photo-1508098682722-e99c43a406b2" alt="Football">
        </div>
    </div>
</section>

<!-- CONTACT -->
<section id="contact">
    <div class="container">
        <h1>Contact</h1>
        <p>Thanks for visiting my website!</p>
    </div>
</section>

<footer>
    © 2026 Bara | Interactive Website
</footer>

<script>
function toggleMenu() {
    document.getElementById("menu").classList.toggle("show");
}

function showMessage() {
    alert("Welcome to Bara's awesome website! 🎮⚽");
}
</script>

</body>
</html>






