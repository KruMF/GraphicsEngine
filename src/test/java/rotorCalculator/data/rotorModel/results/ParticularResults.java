package rotorCalculator.data.rotorModel.results;

//TODO: finish this
public interface ParticularResults {
    //

    //
    abstract class AbstractResults {
        //

        //
        AbstractResults() {
            //
        }

        //
    }

    //
    class JointLimitResults extends AbstractResults {
        public double
                maxTangentialSpeed,
                referenceRadius,
                rotationalPeriod,
                rpm,
                angularVelocity;

        //
        JointLimitResults() {
            //
        }

        //
    }

    //
    class CoriolisLimitResults extends AbstractResults {
        public double
                MaxCoriolisEffect,
                ReferenceRunningSpeed,
                MaxAngularVelocity;

        //
        CoriolisLimitResults() {
            //
        }

        //
    }

    //
    class TotalOmegaLimitResults extends AbstractResults {
        public double finalMaxAngularVelocity;

        //
        TotalOmegaLimitResults() {
            //
        }

        //
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

        //
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

        //
    }

    //
    class TotalRadiusLimitResults extends AbstractResults {
        public double finalMinimumRadius;

        //
        TotalRadiusLimitResults() {
            //
        }

        //
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

        //
    }
}