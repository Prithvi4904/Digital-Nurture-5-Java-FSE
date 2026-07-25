import { Routes } from '@angular/router';
import { Home } from './home/home';
import { CourseList } from './course-list/course-list';
import { StudentProfile } from './student-profile/student-profile';
import { EnrollmentForm } from './enrollment-form/enrollment-form';
import { ReactiveEnrollmentForm } from './reactive-enrollment-form/reactive-enrollment-form';
import { CourseDetails } from './course-details/course-details';
import { authGuard } from './auth-guard';

export const routes: Routes = [
  { path: '', component: Home },
  { path: 'courses', component: CourseList },
  { path: 'profile', component: StudentProfile, canActivate: [authGuard] },
  { path: 'enroll', component: EnrollmentForm },
  { path: 'reactive-enroll', component: ReactiveEnrollmentForm },
  { path: 'course/:id', component: CourseDetails },
  { path: 'admin', loadComponent: () => import('./admin/admin').then(m => m.Admin) },
  { path: '**', redirectTo: '' }
];
