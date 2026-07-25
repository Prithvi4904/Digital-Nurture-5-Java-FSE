import { ComponentFixture, TestBed } from '@angular/core/testing';
import { provideMockStore, MockStore } from '@ngrx/store/testing';
import { CourseList } from './course-list';
import { selectAllCourses } from '../state/course.selectors';
import { By } from '@angular/platform-browser';

describe('CourseList', () => {
  let component: CourseList;
  let fixture: ComponentFixture<CourseList>;
  let store: MockStore;
  const initialState = { courses: { courses: [], loading: false, error: null } };

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CourseList],
      providers: [
        provideMockStore({ initialState })
      ]
    })
    .compileComponents();

    store = TestBed.inject(MockStore);
    fixture = TestBed.createComponent(CourseList);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should render courses from store', () => {
    store.overrideSelector(selectAllCourses, [{ id: '1', name: 'Angular Basics' }]);
    store.refreshState();
    fixture.detectChanges();

    const courseCards = fixture.debugElement.queryAll(By.css('app-course-card'));
    expect(courseCards.length).toBe(1);
  });
});
