<?php

sleep(2);

$recipe = new stdClass();
$recipe->id = 1;
$recipe->user = 'Sarah';
$recipe->food_picture = 'https://www.onceuponachef.com/images/2017/10/How-To-Make-Hard-Boiled-Eggs-850x577.jpg';
$recipe->r_name = 'Boiled Eggs';
$recipe->r_description = 'First, fill a pot with water and boil the water till it bubbles. Then, slowly add your eggs in and cover the lid. Wait 5 minutes and your boiled eggs will be done.';

$recipe2 = new stdClass();
$recipe2->id = 2;
$recipe2->user = 'Jake';
$recipe2->food_picture = 'https://www.inspiredtaste.net/wp-content/uploads/2016/07/Pancake-Recipe-1-1200.jpg';
$recipe2->r_name = 'Pancakes';
$recipe2->r_description = 'You will need a pancake mix. Crack some eggs into a mixing bowl and whisk it until it becomes smooth. Then, pour the pancake mix in and stir until it is combined. Cook it under medium heat and finally, serve it.';

$recipe3 = new stdClass();
$recipe3->id = 3;
$recipe3->user = 'Peter';
$recipe3->food_picture = 'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimg1.cookinglight.timeinc.net%2Fsites%2Fdefault%2Ffiles%2Fstyles%2Fmedium_2x%2Fpublic%2Fimage%2F2017%2F01%2Fmain%2Fpristine-sunny-side-up-eggs.jpg%3Fitok%3Dm7JG2Y8j';
$recipe3->r_name = 'Fried Eggs';
$recipe3->r_description = 'Heat up some oil in a skillet. Crack and cook your eggs. Serve it with some bread or sauce.';

$recipes = array($recipe, $recipe2, $recipe3);

$json = json_encode($recipes);

echo $json;
