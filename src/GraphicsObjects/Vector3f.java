package GraphicsObjects;


public class Vector3f {

    public float x = 0;
    public float y = 0;
    public float z = 0;

    public Vector3f() {
        x = 0.0f;
        y = 0.0f;
        z = 0.0f;
    }

    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //implement Vector plus a Vector  and comment what the method does
    public Vector3f plusVector(Vector3f additional) {
        // Vector plus a vector is a new vector
        return new Vector3f(this.x + additional.x, this.y + additional.y, this.z + additional.z);
    }

    //implement Vector minus a Vector  and comment what the method does
    public Vector3f minusVector(Vector3f minus) {
        // Vector minus a vector is a new vector
        return new Vector3f(this.x - minus.x, this.y - minus.y, this.z - minus.z);
    }

    //implement Vector plus a Point and comment what the method does
    public Point3f plusPoint(Point3f additional) {
        // Vector plus a point is a point
        return new Point3f(this.x + additional.x, this.y + additional.y, this.z + additional.z);
    }
    //Do not implement Vector minus a Point as it is undefined

    //Implement a Vector * Scalar  and comment what the method does    ( we wont create Scalar * Vector due to expediency )
    public Vector3f byScalar(float scale) {
        // Vector * Scalar is a vector
        return new Vector3f(this.x * scale, this.y * scale, this.z * scale);
    }

    //implement returning the negative of a Vector  and comment what the method does
    public Vector3f negative() {
        // The negative of a vector is a vector
        return new Vector3f(-this.x, -this.y, -this.z);
    }

    //implement getting the length of a Vector    and comment what the method does
    public float length() {
        // The length of a Vector: (x ** 2 + y ** 2 + z ** 2) ** 0.5
        return (float) Math.pow(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2), 0.5);
    }

    //implement getting the Normal  of a Vector   and comment what the method does
    // Remember that since you just have one vector, this method is returning a normalized vector with a one unity length
    public Vector3f normal() {
        // The length of the normal of a vector is 1
        float length = length();
        return new Vector3f(this.x / length, this.y / length, this.z / length);
    }

    //implement getting the dot product of Vector.Vector and comment what the method does
    public float dot(Vector3f v) {
        // v1.v2 = x1x2 + y1y2 + z1z2
        return this.x * v.x + this.y * v.y + this.z * this.z;
    }

    //implement getting the cross product of Vector X Vector and comment what the method does
    public Vector3f cross(Vector3f v) {
        // v1xv2 = (y1z2 - y2z1, x2z1 - x1z2, x1y2 - x2y1)
        return new Vector3f(this.y * v.z - v.y * this.z,
                v.x * this.z - this.x * v.z,
                this.x * v.y - v.x * this.y);
    }
}

/*

                                        MMMM
                                        MMMMMM
                                         MM MMMM
                                         MMI  MMMM
                                         MMM    MMMM
                                         MMM      MMMM
                                          MM        MMMMM
                                          MMM         MMMMM
                                          MMM           OMMMM
                                           MM             .MMMM
MMMMMMMMMMMMMMM                        MMM              .MMMM
MM   IMMMMMMMMMMMMMMMMMMMMMMMM         MMM                 MMMM
MM                  ~MMMMMMMMMMMMMMMMMMMMM                   MMMM
MM                                  OMMMMM                     MMMMM
MM                                                               MMMMM
MM                                                                 MMMMM
MM                                                                   ~MMMM
MM                                                                     =MMMM
MM                                                                        MMMM
MM                                                                       MMMMMM
MM                                                                     MMMMMMMM
MM                                                                  :MMMMMMMM
MM                                                                MMMMMMMMM
MM                                                              MMMMMMMMM
MM                             ,MMMMMMMMMM                    MMMMMMMMM
MM              IMMMMMMMMMMMMMMMMMMMMMMMMM                  MMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM               ZMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMM          MM$             MMMMMMMMM
MMMMMMMMMMMMMM                       MMM            MMMMMMMMM
                                      MMM          MMMMMMMM
                                      MM~       IMMMMMMMM
                                      MM      DMMMMMMMM
                                 MMM    MMMMMMMMM
                                 MMD  MMMMMMMM
                                MMM MMMMMMMM
                                MMMMMMMMMM
                                MMMMMMMM
                                  MMMM
                                  MM
                             GlassGiant.com */