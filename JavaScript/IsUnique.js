/*
Is Unique:
Implement an algorithm to determine if a string has all unique characters.  
What if you cannot use additional data structures?
I: string
O: boolean
C: no additional data structures, optimize
E: empty string
time complexity: linear - O(n)
space complexity: linear - O(n)
*/

let isUnique = (s) => {
  //check each character and store in a hash table
  //if we find that the character is already there, return false
  //when done checking, return true
  //Since every object in JS behaves like - and is generally implemented as - a hashtable

  let hash = {};

  for (let i = 0; i < s.length; i++) {
    let c = s[i];
    if (hash[c]) {
      return false;
    } else {
      hash[c] = true;
    }
  }

  return true;
};

console.log(isUnique('s') === true);
console.log(isUnique('') === true);
console.log(isUnique('ss') === false);
console.log(isUnique('stories') === false);
console.log(isUnique('rainbow') === true);
console.log(isUnique('chirpingmermaid') === false)

/*
    using set object.
    The Set object lets you store unique values of any type.
     we need

     1-Set() Creates a new Set object.
     2-has(value) Returns a boolean asserting whether an element is present with the given value in the Set object or not.

*/

let hasUnique = (str) => {
    let mySet = new Set()
    for (let i=0;i<str.length;i++){
        if (mySet.has(str[i])){
            return false
        }
        else{
             mySet.add(str[i])
         }
     }
     return true
}


console.log(('-------------hasUnique-----------------------'));

console.log(hasUnique('s'));
console.log(hasUnique(''));
console.log(hasUnique('ss') );
console.log(hasUnique('stories'));
console.log(hasUnique('rainbow'));
console.log(hasUnique('chirpingmermaid'))