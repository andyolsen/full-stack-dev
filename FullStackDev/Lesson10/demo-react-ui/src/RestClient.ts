export default class RestClient {

    static baseUrl = "http://localhost:8080"

    static getDestinations() : Promise<any> {
        
        const url = `${RestClient.baseUrl}/destinations`
        const promise1 = fetch(url)
                
        const promise2 = promise1.then(response => {
            return response.json()
        })    
        return promise2
    }

    static getDestinationsV2() : Promise<any> {       
        const url = `${RestClient.baseUrl}/destinations`
        return fetch(url).then(response => {
            return response.json()
        })
    }

    static async getDestination(id: number) : Promise<any> {
        const url = `${RestClient.baseUrl}/destinations/${id}`
        const response = await fetch(url)
        return response.json()
    }

    static addReview(id: number, review: any) : Promise<any> {
        const url = `${RestClient.baseUrl}/destinations/addReviewForDestination/${id}`
        return fetch(
                    url, 
                    { 
                        method: 'PUT', 
                        headers: { 'Content-Type': 'application/json' },
                        body: JSON.stringify(review)
                    }
        )
    }
}