import { CanActivateFn } from '@angular/router';

export const authGuard: CanActivateFn = (route, state) => {
  const isLoggedIn = true; // Hardcoded for demonstration
  console.log('AuthGuard#canActivate called, isLoggedIn:', isLoggedIn);
  return isLoggedIn;
};
