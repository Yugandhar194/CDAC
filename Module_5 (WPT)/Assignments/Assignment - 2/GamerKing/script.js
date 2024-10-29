function showLoginForm() {
    document.getElementById('loginModal').style.display = 'flex';
}

function showSignupForm() {
    document.getElementById('signupModal').style.display = 'flex';
}

function closeModal(modalId) {
    document.getElementById(modalId).style.display = 'none';
}

function login() {
    const email = document.getElementById('loginEmail').value;
    const password = document.getElementById('loginPassword').value;
    alert(`Logged in with ${email}`);
    closeModal('loginModal');
}

function signup() {
    const name = document.getElementById('signupName').value;
    const number = document.getElementById('signupNumber').value;
    const email = document.getElementById('signupEmail').value;
    const password = document.getElementById('signupPassword').value;
    const confirmPassword = document.getElementById('signupConfirmPassword').value;

    if (password === confirmPassword) {
        alert(`Signup successful for ${name}`);
        closeModal('signupModal');
    } else {
        alert('Passwords do not match');
    }
}

let favorites = [];

function addToFavorites(game) {
    if (!favorites.includes(game)) {
        favorites.push(game);
        updateFavorites();
        alert(`${game} added to favorites`);
    } else {
        alert(`${game} is already in favorites`);
    }
}

function updateFavorites() {
    const favoritesLink = document.getElementById('favorites');
    favoritesLink.innerHTML = `Favorites (${favorites.length})`;
}
