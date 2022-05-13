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

    //
    class JointLimitResults extends AbstractResults {
        public double
                maxTangentialSpeed = 5.5678d,
                referenceRadius,
                rotationalPeriod,
                rpm,
                angularVelocity;

        //
        JointLimitResults() {
            //
        }

        public void setResults() {
            //TODO: get actual results here
        }
    }

    //
    class CoriolisLimitResults extends AbstractResults {
        public double
                maxCoriolisEffect,
                referenceRunningSpeed,
                maxAngularVelocity;

        //
        CoriolisLimitResults() {
            //
        }

        public void setResults() {
            //TODO: get actual results here
        }
    }

    //
    class TotalOmegaLimitResults extends AbstractResults {
        public double finalMaxAngularVelocity;

        //
        TotalOmegaLimitResults() {
            //
        }

        public void setResults() {
            //TODO: get actual results here
        }
    }

    //
    class GravityRequirementResults extends AbstractResults {
        public double
                gForce,
                acceleration,
                minimumRadius;

        //
        GravityRequirementResults() {
            //
        }

        public void setResults() {
            //TODO: get actual results here
        }
    }

    //
    class GradientLimitResults extends AbstractResults {
        public double
                gradient,
                referenceHeight,
                minimumRadius;

        //
        GradientLimitResults() {
            //
        }

        public void setResults() {
            //TODO: get actual results here
        }
    }

    //
    class TotalRadiusLimitResults extends AbstractResults {
        public double finalMinimumRadius;

        //
        TotalRadiusLimitResults() {
            //
        }

        public void setResults() {
            //TODO: get actual results here
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

        //
        ActualParameterResults() {
            //
        }

        public void setResults() {
            //TODO: get actual results here
        }
    }
}