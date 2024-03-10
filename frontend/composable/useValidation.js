export const useValidation = () => {
  const validateEmail = (email) => {
    const regEx = /^[^\s@]+@[^\s@]+\.[^\s@]+$/
    if(email.length) {
    console.log(regEx.test(email))
    return regEx.test(email)
    }
}

  return {validateEmail}
}