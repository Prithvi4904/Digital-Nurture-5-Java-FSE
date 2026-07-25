import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Store } from '@ngrx/store';
import { Observable } from 'rxjs';
import { CommonModule } from '@angular/common';

import { CourseCard } from '../course-card/course-card';
import { Highlight } from '../highlight';
import * as CourseActions from '../state/course.actions';
import { selectAllCourses, selectCoursesLoading, selectCoursesError } from '../state/course.selectors';

@Component({
  selector: 'app-course-list',
  imports: [CourseCard, Highlight, CommonModule],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css',
})
export class CourseList implements OnInit {
  courses$: Observable<any[]>;
  loading$: Observable<boolean>;
  error$: Observable<any>;

  constructor(private store: Store, private router: Router) {
    this.courses$ = this.store.select(selectAllCourses);
    this.loading$ = this.store.select(selectCoursesLoading);
    this.error$ = this.store.select(selectCoursesError);
  }

  ngOnInit(): void {
    console.log('CourseListComponent initialized');
    this.store.dispatch(CourseActions.loadCourses());
  }

  refreshCourses(): void {
    this.store.dispatch(CourseActions.loadCourses());
  }

  onCourseSelected(courseId: string): void {
    this.router.navigate(['/course', courseId]);
  }
}
