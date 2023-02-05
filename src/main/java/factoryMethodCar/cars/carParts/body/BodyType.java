package factoryMethodCar.cars.carParts.body;

import factoryMethodCar.cars.carParts.body.door.Door;
import factoryMethodCar.cars.carParts.body.wheels.Wheels;

import java.util.ArrayList;
import java.util.List;

public enum BodyType implements Body{
    SEDAN {
        private final List<Wheels> wheels = new ArrayList<>(amountOfWheels());
        private final List<Door> doors = new ArrayList<>(amountOfDoors());

        @Override
        public BodyType getBodyType() {
            return SEDAN;
        }

        @Override
        public int amountOfDoors() {
            return 5;
        }

        @Override
        public int amountOfSeats() {
            return 5;
        }

        @Override
        public List<Door> getDoors() {
            return doors;
        }

        @Override
        public List<Wheels> getWheels() {
            return wheels;
        }
    },
    CARGO {
        private final List<Wheels> wheels = new ArrayList<>(amountOfWheels());
        private final List<Door> doors = new ArrayList<>(amountOfDoors());

        @Override
        public BodyType getBodyType() {
            return CARGO;
        }

        @Override
        public int amountOfDoors() {
            return 5;
        }

        @Override
        public int amountOfSeats() {
            return 5;
        }

        @Override
        public List<Door> getDoors() {
            return doors;
        }

        @Override
        public List<Wheels> getWheels() {
            return wheels;
        }
    },
    SUV {
        private final List<Wheels> wheels = new ArrayList<>(amountOfWheels());
        private final List<Door> doors = new ArrayList<>(amountOfDoors());

        @Override
        public BodyType getBodyType() {
            return SUV;
        }

        @Override
        public int amountOfDoors() {
            return 5;
        }

        @Override
        public int amountOfSeats() {
            return 5;
        }

        @Override
        public List<Door> getDoors() {
            return doors;
        }

        @Override
        public List<Wheels> getWheels() {
            return wheels;
        }
    },
    LIMOUSINE {
        private final List<Wheels> wheels = new ArrayList<>(amountOfWheels());
        private final List<Door> doors = new ArrayList<>(amountOfDoors());

        @Override
        public BodyType getBodyType() {
            return LIMOUSINE;
        }

        @Override
        public int amountOfDoors() {
            return 5;
        }

        @Override
        public int amountOfSeats() {
            return 6;
        }

        @Override
        public List<Door> getDoors() {
            return doors;
        }

        @Override
        public List<Wheels> getWheels() {
            return wheels;
        }
    },
    SPORT {
        private final List<Wheels> wheels = new ArrayList<>(amountOfWheels());
        private final List<Door> doors = new ArrayList<>(amountOfDoors());

        @Override
        public BodyType getBodyType() {
            return BodyType.SPORT;
        }

        @Override
        public int amountOfDoors() {
            return 3;
        }

        @Override
        public int amountOfSeats() {
            return 4;
        }

        @Override
        public List<Door> getDoors() {
            return doors;
        }

        @Override
        public List<Wheels> getWheels() {
            return wheels;
        }
    },
    ;
    @Override
    public int amountOfWheels() {
        return 4;
    }
}
