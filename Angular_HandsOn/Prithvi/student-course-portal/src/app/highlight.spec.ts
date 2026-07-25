import { Highlight } from './highlight';
import { ElementRef, Renderer2 } from '@angular/core';

describe('Highlight', () => {
  it('should create an instance', () => {
    const mockElementRef = { nativeElement: {} } as ElementRef;
    const mockRenderer = {} as Renderer2;
    const directive = new Highlight(mockElementRef, mockRenderer);
    expect(directive).toBeTruthy();
  });
});
