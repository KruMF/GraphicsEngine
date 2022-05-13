package rotorCalculator.data.rotorModel.results;

import rotorCalculator.data.Data;
import rotorCalculator.data.innerJointModel.InnerJoint;

//TODO: finish this
public interface ParticularResults {
    //

    double DEFAULT_DOUBLE = 1.234567d;

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
            maxTangentialSpeed = DEFAULT_DOUBLE;
            referenceRadius = DEFAULT_DOUBLE;
            rotationalPeriod = DEFAULT_DOUBLE;
            rpm = DEFAULT_DOUBLE;
            angularVelocity = DEFAULT_DOUBLE;
        }

        public void setResults() {
            maxTangentialSpeed = Data.rotor.innerJoint.getTangentialVelocity();
            referenceRadius = Data.rotor.innerJoint.radius;
            rotationalPeriod = Data.rotor.innerJoint.getRotationPeriod();
            rpm = Data.rotor.innerJoint.maxRPM;
            angularVelocity = Data.rotor.innerJoint.getAngularVelocity();
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
            maxCoriolisEffect = DEFAULT_DOUBLE;
            referenceRunningSpeed = DEFAULT_DOUBLE;
            maxAngularVelocity = DEFAULT_DOUBLE;
        }

        public void setResults() {
            //TODO: get actual results here
            maxCoriolisEffect = DEFAULT_DOUBLE;
            referenceRunningSpeed = DEFAULT_DOUBLE;
            maxAngularVelocity = DEFAULT_DOUBLE;
        }
    }

    //
    class TotalOmegaLimitResults extends AbstractResults {
        public double finalMaxAngularVelocity;

        //sets default values
        TotalOmegaLimitResults() {
            finalMaxAngularVelocity = DEFAULT_DOUBLE;
        }

        public void setResults() {
            //TODO: get actual results here
            finalMaxAngularVelocity = DEFAULT_DOUBLE;
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
            gForce = DEFAULT_DOUBLE;
            acceleration = DEFAULT_DOUBLE;
            minimumRadius = DEFAULT_DOUBLE;
        }

        public void setResults() {
            //TODO: get actual results here
            gForce = DEFAULT_DOUBLE;
            acceleration = DEFAULT_DOUBLE;
            minimumRadius = DEFAULT_DOUBLE;
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
            gradient = DEFAULT_DOUBLE;
            referenceHeight = DEFAULT_DOUBLE;
            minimumRadius = DEFAULT_DOUBLE;
        }

        public void setResults() {
            //TODO: get actual results here
            gradient = DEFAULT_DOUBLE;
            referenceHeight = DEFAULT_DOUBLE;
            minimumRadius = DEFAULT_DOUBLE;
        }
    }

    //
    class TotalRadiusLimitResults extends AbstractResults {
        public double finalMinimumRadius;

        //sets default values
        TotalRadiusLimitResults() {
            finalMinimumRadius = DEFAULT_DOUBLE;
        }

        public void setResults() {
            //TODO: get actual results here
            finalMinimumRadius = DEFAULT_DOUBLE;
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
            radius = DEFAULT_DOUBLE;
            angularVelocity = DEFAULT_DOUBLE;
            rpm = DEFAULT_DOUBLE;
            rotationalPeriod = DEFAULT_DOUBLE;
            tangentialVelocity = DEFAULT_DOUBLE;
        }

        public void setResults() {
            //TODO: get actual results here
            radius = DEFAULT_DOUBLE;
            angularVelocity = DEFAULT_DOUBLE;
            rpm = DEFAULT_DOUBLE;
            rotationalPeriod = DEFAULT_DOUBLE;
            tangentialVelocity = DEFAULT_DOUBLE;
        }
    }
}