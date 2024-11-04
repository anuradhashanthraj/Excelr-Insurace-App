// Validation function example for the Request Quote form
document.getElementById("requestQuoteForm").onsubmit = function() {
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;

    if (name === "" || email === "") {
        alert("Please fill all required fields");
        return false;
    }
    // Further validation checks
    return true;
};
