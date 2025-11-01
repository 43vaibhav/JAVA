/*
Gravity Glide
Problem Description
Aarav is learning programming by creating fun simulations. One day, he decides to build a game where a ball drops onto a 2D grid filled with diagonal slides.

Aarav's game involves a ball that drops onto a grid. The grid contains several diagonal slides, each placed randomly and tilted at a 45-degree angle. When the ball is dropped from a starting point, it will slide along a slope if it lands on one; otherwise, gravity pulls it straight down.

Aarav starts with a certain amount of energy. For every unit of distance the ball slides, it uses 1 unit of energy. If the ball gets stuck between two slides, it can unlock itself by spending energy equal to the product of its current x-coordinate and y-coordinate. Once unlocked, the ball continues sliding along any available slide, still using 1 unit of energy per unit distance.

The ball keeps moving until it either reaches the ground (x = 0) or runs out of energy and gets stuck. Slides may touch but never cross each other, creating complex paths where the ball can change direction. No two slides are collinear. From any given point, the ball will always have only one possible direction to move.

Constraints
1 <= number of sliders <= 50

0 <= x, y coordinates <= 50

The inputs will always ensure that from the given point, the ball will have only one possible direction to move.

If the ball is on the slide, it should be considered on the outer side, not the inner side. Outer side is the side facing top of the grid.

Input
The first line contains an integer N, the number of slides.

The next N lines each contain four space-separated integers, representing the starting and ending points of each slide.

The last line contains three space-separated integers: the starting x and y coordinates of the ball, and its initial energy.

Output
Print the final position (x, y) where the ball lands.

Time Limit (secs)
1

Examples
Example 1

Input

8

2 4 5 1

1 3 3 1

2 5 5 8

4 5 6 3

1 10 3 8

4 10 6 12

1 14 3 12

3 6 1 8

5 15 21

Output

2 4

Explanation

The given input is visualized below.

com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@57a4d5ee:image1.png

The black lines indicate sliders while the red dot is the position from where the ball is dropped.

The ball starts at (5, 15) with 21 units of energy.
It falls to (5, 11) due to gravity, then slides one unit (energy left: 20).
Gravity pulls it to (4, 7), then it slides to (3, 6) (energy left: 19).
At (3, 6), the ball is stuck. To unlock, it spends 18 energy (3 × 6), leaving 1 unit.
With 1 unit energy left, it slides to (2, 5), then gravity pulls it to (2, 4), where it stops. Hence (2, 4) is the final position of the ball.
Example 2

Input

7

1 1 3 3

4 1 6 3

4 5 5 6

2 5 4 3

2 2 0 4

5 2 7 0

5 6 7 4

2 7 5

Output

4 0

Explanation

The given input is visualized below.

com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@57a4d5ee:image2.png

The black lines indicate sliders while the red dot is the position from where the ball is dropped.

The ball starts at (2, 7) with 5 units of energy.
Gravity pulls it to (2, 5), then it slides to (4, 3) (energy left: 3).
Gravity pulls it to (4, 1), then to (4, 0), where it stops.
*/
public class gravitySlide {

}
