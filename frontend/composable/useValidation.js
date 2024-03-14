export const useValidation = () => {
  const validateEmail = (email) => {
    if (email) {
      const regEx = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
      console.log(regEx.test(email));
      return regEx.test(email);
    }
  };

  return { validateEmail };
};
