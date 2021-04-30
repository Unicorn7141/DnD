class Map {
    private fun getRandomLocation(): Location {
        val locations = listOf(Location.HOUSE, Location.FOREST, Location.DUNGEON, Location.CLIFF,
        Location.CAVE, Location.CASTLE, Location.ISLAND, Location.MANSION, Location.MOUNTAIN, Location.VILLAGE)

        return locations.shuffled()[1]
    }

    val startingPoint = getRandomLocation()
    var currentLocation = startingPoint
    private var renders = 0
    // Let's create our map
    fun renderMap(): MutableMap<Direction, Location> {
        val map = mutableMapOf<Direction, Location>()
        val directions = listOf(Direction.BACK, Direction.DOWN, Direction.FORWARD,
            Direction.LEFT, Direction.RIGHT, Direction.UP)
        if (renders == 0) {
            for (direction in directions) {
                val loc = getRandomLocation()
                val registeredLocations = map.values.toList()
                if (loc != startingPoint) {
                    if (direction == Direction.UP && !listOf(Location.MOUNTAIN, Location.CAVE, Location.CLIFF).any { it == loc })
                        if (!registeredLocations.any { it == loc }) {
                            map[direction] = loc
                        }
                }
            }
        }

        return map
    }
}