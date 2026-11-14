# Sort
This was a challenge that was proposed by a friend back in 2019.

## The Challenge
Given an array with length n, but only three types of elements inside of them (in this case, 0s, 1s and 2s), write an algorithm that can sort this array in just one for loop (or less).

## How does that work?
We will create two variables with coordinates. `i` is the loop index that walks through the array. `j` represents the position where the next smallest element (0) should go, which is the position right after the last 0 placed so far. `k` represents the position of the last biggest element (2) that hasn't been placed yet, which is the end of the unsorted region.
As `i` walks through the array, if we notice a 0, we swap it with the element at `j` and increment `j`. If we notice a 2, we swap it with the element at `k` and decrement `k`. The loop stops once `i` passes `k`.
When we swap a 2, the element that comes from position `k` is not yet analyzed, so we step `i` back and reanalyze the same index. If the element is a 1, it's already in its place and we keep walking through the array.

## Complexity
Since it sorts the array in just one loop, the average performance of this algorithm is O(n)

## What if we just procceed adding variables to determine the last or first element of each kind?
That's indeed a good question!
While just manually creating variables would be impossible, since we can't really control how many kinds of elements there will be in an array, we can, actually, do it recursively, where we find the smallest elements and place them at the beginning of the array and the biggest elements at the end of it, and, once we get to its end, we just start from what would be the last smallest element and repeat the proccess until there are no elements left to be checked.
This is called a Selection Sort and its average performance is O(n^2)
