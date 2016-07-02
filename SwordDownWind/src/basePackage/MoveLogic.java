package basePackage;

public class MoveLogic {
	public static int[][] moveStrategy(int[][] matrix,int moveCode,int Person_x,int Person_y) {
		switch (moveCode) {
		case LenthAll.UPVALUE:
			if(matrix[Person_x - 1][Person_y] == MapDeploy.MOUNTAIN_ON || 
			matrix[Person_x - 1][Person_y] == MapDeploy.HOUSE_ON || 
			matrix[Person_x - 1][Person_y] == MapDeploy.SEA_ON ||
			matrix[Person_x - 1][Person_y] == MapDeploy.TREE_ON ||
			matrix[Person_x - 1][Person_y] == MapDeploy.BOSS_ON){
				break;
			}
			matrix[Person_x--][Person_y] = MapDeploy.GRASSLAND_ON;
			matrix[Person_x][Person_y] = MapDeploy.PERSON_STAND;
			break;
		case LenthAll.DOWNVALUE:
			if(matrix[Person_x + 1][Person_y] == MapDeploy.MOUNTAIN_ON || 
			matrix[Person_x + 1][Person_y] == MapDeploy.HOUSE_ON || 
			matrix[Person_x + 1][Person_y] == MapDeploy.SEA_ON ||
			matrix[Person_x + 1][Person_y] == MapDeploy.BOSS_ON ||
			matrix[Person_x + 1][Person_y] == MapDeploy.TREE_ON){
				break;
			}
			matrix[Person_x++][Person_y] = MapDeploy.GRASSLAND_ON;
			matrix[Person_x][Person_y] = MapDeploy.PERSON_STAND;
			break;
		case LenthAll.LEFTVALUE:
			if(matrix[Person_x][Person_y - 1] == MapDeploy.MOUNTAIN_ON || 
			matrix[Person_x][Person_y - 1] == MapDeploy.HOUSE_ON || 
			matrix[Person_x][Person_y - 1] == MapDeploy.SEA_ON || 
			matrix[Person_x][Person_y - 1] == MapDeploy.BOSS_ON ||
			matrix[Person_x][Person_y - 1] == MapDeploy.TREE_ON){
				break;
			}
			matrix[Person_x][Person_y--] = MapDeploy.GRASSLAND_ON;
			matrix[Person_x][Person_y] = MapDeploy.PERSON_STAND;
			break;
		case LenthAll.RIGHTVALUE:
			if(matrix[Person_x][Person_y + 1] == MapDeploy.MOUNTAIN_ON || 
			matrix[Person_x][Person_y + 1] == MapDeploy.HOUSE_ON || 
			matrix[Person_x][Person_y + 1] == MapDeploy.SEA_ON ||
			matrix[Person_x][Person_y + 1] == MapDeploy.BOSS_ON ||
			matrix[Person_x][Person_y + 1] == MapDeploy.TREE_ON){
				break;
			}
			matrix[Person_x][Person_y++] = MapDeploy.GRASSLAND_ON;
			matrix[Person_x][Person_y] = MapDeploy.PERSON_STAND;
			break;
		default:
			break;
		}
		return matrix;
	}
}
