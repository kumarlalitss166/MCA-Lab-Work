class Solution:
    def networkData(self):
        ipv4 = input("Enter an IPv4 Address: ")
        subMask = input("Enter a subnet mask: ")
        return ipv4, subMask
    def networkDetails(self, ipv4, subMask):

        ipSegments = ipv4.split('.')
        if len(ipSegments) != 4:
            print("Not a Valid IP Address.")
            exit()

        # Network ID
        networkID = int(ipSegments[0])
        if networkID in range(128):
            value = 1
        elif networkID in range(128, 192):
            value = 2
        elif networkID in range(192, 224):
            value = 3
        elif networkID in range(224, 240):
            value = 4
        elif networkID in range(240, 256):
            value = 5
        else:
            print("Not a Valid IP Address.")
            exit()
        print("Network ID:\t\t\t", networkID)
        
        broadcastIDSegment = ['.255.255.255', '.255.255','.255' ]
        firstIDSegment = ['.0.0.1', '.0.0.1', '.0.0.1']
        lastIDSegment = ['.255.255.254', '.255.255.254', '.255.255.254']
        cidrSegment = ['/8', '/16', '/24', 'NA', 'NA']
        validHosts = [pow(2, 24) - 2, pow(2, 16) - 2, pow(2, 8) - 2, 'NA', 'NA']
        classesSegment = ['A', 'B', 'C', 'D', 'E']
        
        if value != 4 and value != 5:
            # Broadcast Address
            broadcastID =  '.'.join(ipSegments[:value]) + broadcastIDSegment[value - 1]
            # First and Last Address
            firstId = ipSegments[0] + firstIDSegment[value - 1]
            lastID = ipSegments[0] + lastIDSegment[value - 1]
        else:
            broadcastID = 'NA'
            firstId = 'NA'
            lastID = 'NA'
        print("Broadcast Address:\t\t", broadcastID)
        print("First Host Address:\t\t", firstId)
        print("Last Host Address:\t\t", lastID)
        # CIDR Notation
        cidrNotation = cidrSegment[value - 1]
        print("CIDR Notation:\t\t\t", cidrNotation)
        # Number of Valid Host IDs
        print("Number of Valid Hosts IDs:\t", validHosts[value - 1])
        # Class of Network
        print('IP Address Class:\t\t',classesSegment[value - 1])


Obj = Solution()
ipv4, subMask = Obj.networkData()
Obj.networkDetails(ipv4, subMask)
