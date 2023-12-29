# Define the cylinder queue and initial head position
cylinders = [98, 183, 41, 122, 14, 124, 65, 67]
head = 53

# Initialize total head movement
total_movement = 0

# Service requests in the direction of head movement (towards higher cylinders)
for cylinder in cylinders:
    if cylinder >= head:
        total_movement += abs(cylinder - head)
        head = cylinder

# Move the head to the other end of the disk for the reverse sweep
total_movement += abs(199 - head)

# Service requests in the reverse direction (towards lower cylinders)
for cylinder in reversed(cylinders):
    if cylinder <= head:
        total_movement += abs(cylinder - head)
        head = cylinder

# Print the total head movement
print("Total head movement:", total_movement)