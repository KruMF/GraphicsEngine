package rotorCalculator.data.rotorModel.results;

//TODO: finish this
public interface ParticularResults {
    //

    //
    abstract class AbstractResults {
        //

        //
        protected AbstractResults() {
            //
        }

        //
    }

    //Inner joint limits
    class JointLimitResults extends AbstractResults {
        public double
                maxTangentialSpeed,
                referenceRadius,
                rotationalPeriod,
                rpm,
                angularVelocity;

        //sets default values
        JointLimitResults() {
            maxTangentialSpeed = 1.2345d;
            referenceRadius = 1.2345d;
            rotationalPeriod = 1.2345d;
            rpm = 1.2345d;
            angularVelocity = 1.2345d;
        }

        public void setResults() {
            //TODO: get actual results here
            maxTangentialSpeed = 1.2345d;
            referenceRadius = 1.2345d;
            rotationalPeriod = 1.2345d;
            rpm = 1.2345d;
            angularVelocity = 1.2345d;
        }
    }

    //Coriolis effect limits
    class CoriolisLimitResults extends AbstractResults {
        public double
                maxCoriolisEffect,
                referenceRunningSpeed,
                maxAngularVelocity;

        //sets default values
        CoriolisLimitResults() {
            maxCoriolisEffect = 1.2345d;
            referenceRunningSpeed = 1.2345d;
            maxAngularVelocity = 1.2345d;
        }

        public void setResults() {
            //TODO: get actual results here
            maxCoriolisEffect = 1.2345d;
            referenceRunningSpeed = 1.2345d;
            maxAngularVelocity = 1.2345d;
        }
    }

    //
    class TotalOmegaLimitResults extends AbstractResults {
        public double finalMaxAngularVelocity;

        //sets default values
        TotalOmegaLimitResults() {
            finalMaxAngularVelocity = 1.2345d;
        }

        public void setResults() {
            //TODO: get actual results here
            finalMaxAngularVelocity = 1.2345d;
        }
    }

    //
    class GravityRequirementResults extends AbstractResults {
        public double
                gForce,
                acceleration,
                minimumRadius;

        //sets default values
        GravityRequirementResults() {
            gForce = 1.2345d;
            acceleration = 1.2345d;
            minimumRadius = 1.2345d;
        }

        public void setResults() {
            //TODO: get actual results here
            gForce = 1.2345d;
            acceleration = 1.2345d;
            minimumRadius = 1.2345d;
        }
    }

    //
    class GradientLimitResults extends AbstractResults {
        public double
                gradient,
                referenceHeight,
                minimumRadius;

        //sets default values
        GradientLimitResults() {
            gradient = 1.2345d;
            referenceHeight = 1.2345d;
            minimumRadius = 1.2345d;
        }

        public void setResults() {
            //TODO: get actual results here
            gradient = 1.2345d;
            referenceHeight = 1.2345d;
            minimumRadius = 1.2345d;
        }
    }

    //
    class TotalRadiusLimitResults extends AbstractResults {
        public double finalMinimumRadius;

        //sets default values
        TotalRadiusLimitResults() {
            finalMinimumRadius = 1.2345d;
        }

        public void setResults() {
            //TODO: get actual results here
            finalMinimumRadius = 1.2345d;
        }
    }

    //
    class ActualParameterResults extends AbstractResults {
        public double
                radius,
                angularVelocity,
                rpm,
                rotationalPeriod,
                tangentialVelocity;

        //sets default values
        ActualParameterResults() {
            radius = 1.2345d;
            angularVelocity = 1.2345d;
            rpm = 1.2345d;
            rotationalPeriod = 1.2345d;
            tangentialVelocity = 1.2345d;
        }

        public void setResults() {
            //TODO: get actual results here
            radius = 1.2345d;
            angularVelocity = 1.2345d;
            rpm = 1.2345d;
            rotationalPeriod = 1.2345d;
            tangentialVelocity = 1.2345d;
        }
    }
}