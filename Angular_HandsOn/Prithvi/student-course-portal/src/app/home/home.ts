import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  imports: [FormsModule],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {
  title = 'Student Course Portal';
  welcomeMessage = 'Welcome to the Student Course Portal. Browse our courses and enroll today!';
  searchQuery = '';
}
