import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-course-details',
  imports: [],
  templateUrl: './course-details.html',
  styleUrl: './course-details.css',
})
export class CourseDetails implements OnInit {
  courseId: string | null = null;

  constructor(private route: ActivatedRoute) {}

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      this.courseId = params.get('id');
    });
  }
}
