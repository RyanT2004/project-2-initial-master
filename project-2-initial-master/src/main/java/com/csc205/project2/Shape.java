package com.csc205.project2;

public abstract class Shape implements ThreeDimensionalShape {

    public Shape(){

    }


        // I was messing around to see if this would work, and it did, but I marked it off for now.
        /*
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(getClass().getSimpleName());
            sb.append(": {surface area=").append(surfaceArea());
            sb.append(", volume=").append(volume());
            sb.append('}');
            return sb.toString() + " Im a 3D Shape."
            ;
        }
        */


}
