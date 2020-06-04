# Sort
This was a challenge that was proposed by a friend back in 2019.

## The Challenge
Given an array with length n, but only three types of elements inside of them (in this case, 0s, 1s and 2s), write an algorithm that can sort this array in just one for loop (or less).

## How does that work?
We will create two varibles with coordinates. One of them will represent the position of the last smallest element (i) and the other one will represent the position of the first biggest element (j).
As we walk through the array, if we notice an element that is from the same group as the smallest ones, we swap its position with the element at i+1 and update its position. The same goes for the biggest ones, but in this case, we swap with the element at (j-1).
Just in case, we reanalize this index and, if we're at an element that is in its place, we keep walking through the array. 

## Complexity
Since it sorts the array in just one loop, the average performance of this algorithm is O(n)

## What if we just procceed adding variables to determine the last or first element of each kind?
That's indeed a good question!
While just manually creating variables would be impossible, since we can't really control how many kinds of elements there will be in an array, we can, actually, do it recursively, where we find the smallest elements and place them at the beginning of the array and the biggest elements at the end of it, and, once we get to its end, we just start from what would be the last smallest element and repeat the proccess until there are no elements left to be checked.
This is called a Selection Sort and its average performance is O(n^2)
