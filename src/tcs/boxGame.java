/*
Problem Description

Dev, a Rubik's Cube whiz who specializes in solving just one side, challenges his brother Ved with a tricky twist.

The Challenge:

Dev scrambles a Rubik's Cube and gives Ved a set of instructions to solve one specific face. But there is a catch! Dev might have secretly changed the colour of one cube unit, making the cube slightly faulty. To make things even harder, he also includes one extra, incorrect instruction in the list.

Ved must now figure out:

Is the cube faulty? Did Dev change a cube's colour?
Identify the wrong instruction. Which step in the instructions will lead to failure if followed?
Can you help Ved solve this Rubik's Cube puzzle with a twist?

The Rubik Cube schematics are described below

com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@38cedb7d:image1.jpegcom.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@38cedb7d:image2.png com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@38cedb7d:image3.jpeg

Faces of the cubes are described according to the numbers.

1 - base, 2 - back, 3 - top, 4 - front, 5 - left, 6 - right.

Rules:

1. 'turn left' - front goes to left, left goes to back, back goes to right, right goes to front, top side will be rotated right, whereas base side will be rotated left.

2. 'turn right' - front goes to right, right goes to back, back goes to left, left goes to front, top side will be rotated left, whereas base side will be rotated right.

3. 'rotate front' - front goes to base, base goes to back, back goes to top, top goes to front, left side will be rotated right, whereas right side will be rotated left.

4. 'rotate back' - front goes to top, top goes to back, back goes to base, base goes to front, left side will be rotated left, whereas right side will be rotated right.

5. 'rotate left' - top goes to left, left goes to base, base goes to right, right goes to top, front side will be rotated left, whereas back side will be rotated right.

6. 'rotate right' - top goes to right, right goes to base, base goes to left, left goes to top, front side will be rotated right, whereas back side will be rotated left.

7. '<side> <row/col> <direction>' - this will turn the row/column (1-indexed) of the side '<side>' in the given direction '<direction>'. E.g. If the instruction is 'top 1 left', this states that the 1st row of the top side will be turned towards left. If the instruction is 'top 1 down', this states that the 1st column of the top side will be turned downwards. (The direction is specified by imagining the specific side in the front of the eye level, then the row/column is turned).

You are given the initial faces of the cube (visualize it being placed in front at eye level), and the instructions that Dev had given to Ved (instructions comprises of the rules described above). The faces may have multiple colours defined by various alphabets.

Note: There is no guarantee that the colour which is faulty will be the one which will be completed after executing the instructions.

Constraints

3 <= N <= 15

2 <= K <= 101

Colours on each side of the box consists of upper-case English alphabets only.

Input

First line consists of 2 space separated integers - N & K (where 'N' is the number of rows and columns on each side of the face and 'K' is the number of instructions Dev provided to Ved)

Next 6*N lines, each N lines describes each face of the cube in the order described above with each line consisting of N space separated characters.

Next 'K' lines describe the instructions the cube will perform.

Line 1: N K Two space-separated integers:
N: The number of rows and columns on each side of the Rubik's Cube face.
K: The number of instructions Dev provides to Ved.
Next 6N lines: Each of these lines represents a face of the cube, described as follows:
Line Format: N space-separated characters (representing the colours on that face).
Order: The faces are described in this order: Base, Back, Top, Front, Left, Right.
Last K lines: Each line describes an instruction Dev gives Ved, where each instruction might involve rotating a specific face's column/row (e.g., "right 2 up" means rotate the 2nd column of right face upwards).
Output

"Faulty" (If and only if the cube is faulty, without quotes)

<extra_instruction>

OR

"Not Possible" (If after executing instructions, the side of the cube is unsolved, without quotes)

Time Limit (secs)
1

Examples

Example 1

Input

3 4

W R G

G R B

W R B

Y Y W

W G R

R B R

O G O

O O O

O O O

G W G

Y B W

R Y R

B B Y

G W B

G W B

W Y B

G Y R

Y O Y

back 2 down

front 3 right

front 1 up

back 2 up

Output

front 1 up

Explanation

com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@38cedb7d:image4.png

com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@38cedb7d:image5.png

The required rotations of the cube to solve one side are described in the pictures above. The third instruction (front 1 up) is the extra instruction which leads one side of the cube unsolved. Also, the cube is not faulty, therefore, the answer is: "front 1 up"

Example 2

Input

3 6

W O O

G W G

R R B

G O R

B R W

O W G

Y W W

Y Y W

Y Y O

R R Y

B O Y

R G Y

G G B

B G R

W R B

G G O

B B O

B O W

front 3 up

turn left

front 3 down

top 2 down

left 2 right

top 3 up

Output

Faulty

top 2 down

Explanation

com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@38cedb7d:image6.png

com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@38cedb7d:image7.png

com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@38cedb7d:image8.png

From the images above, one unit of 'Y' color is manipulated with one unit of 'G' color. After correcting the manipulation and executing the instructions, we can say that the instruction 'top 2 down' is an extra instruction causing one side of the cube being unsolved. Therefore, the answer is:

Faulty

top 2 down

Example 3

Input

3 2

O O Y

G G R

R B Y

W Y B

B Y W

B W G

W B R

G B R

G G W

R R O

G W O

B Y O

O O Y

O O Y

W W Y

G W B

B R R

G Y R

base 1 right

top 2 left

Output

Not Possible

Explanation

com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@38cedb7d:image9.png

It can be analyzed the cube is not faulty and executing any of the instructions does not lead to solve one of the sides. Therefore, the answer is: "Not Possible"
*/
package tcs;
public class boxGame {
    public static void main(String[] args){
        
    }
}
