export const useAuth = () => {
  const register = async (authData) => {
    try {
      const response = await fetch('http://localhost:8080/api/auth/register', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(authData)
      });
      const {token} = await response.json();
      sessionStorage.setItem('jwtToken', token);

    } catch (error) {
      console.error('Registration failed:', error);
    }
  }
  return {register}
}