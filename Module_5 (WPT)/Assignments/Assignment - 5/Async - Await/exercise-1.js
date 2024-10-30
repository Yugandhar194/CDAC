var fetchUser = () => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve({ data: { user: "Yugandhar", admin: true } });
    }, 3000);
  });
};

var login = (user) => {
  if (user.admin === true) {
    console.log("Login Success!");
  } else {
    console.log("Login Failed!");
  }
};

const useAdmin = async () => {
  const result = await fetchUser();
  console.log(result); 
  login(result.data);
};

useAdmin();
console.log("JS Code complete!");

/*
    1. Create a function called "fetchUser" that returns 
       a Promise that resolves with the value :
       { data: {user: "Monkey", admin: true} } after 3 seconds
    2. Create a function called "login" that takes an Object
       as an argument. If the object has a property called 
       "admin" with a value of true, then log out
       "Successfully logged in!", otherwise log out
       "Failed to log in, please try again."

    3. Print out "Program starting..."
    
    4. Create an async function that uses await to wait for
       the data to comes back from "fetchUser".
    
    5. Pass the user that comes back from "fetchUser" to the
       "login" function you created above

    6. Call the async function you created
    7. Log out "Program complete!"
*/

